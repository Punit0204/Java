import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Process {
    int processId;
    int burstTime;
    int remainingBurstTime;
    int arrivalTime;
    int waitingTime;
    int turnaroundTime;

    Process(int processId, int burstTime, int arrivalTime) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingBurstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
    }
}

public class RoundRobinScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();

        ArrayList<Process> processes = new ArrayList<>();
        System.out.println("Enter the burst time and arrival time for each process:");

        for (int i = 1; i <= n; i++) {
            System.out.print("Process " + i + " burst time: ");
            int burstTime = scanner.nextInt();
            System.out.print("Process " + i + " arrival time: ");
            int arrivalTime = scanner.nextInt();

            Process process = new Process(i, burstTime, arrivalTime);
            processes.add(process);
        }

        System.out.print("Enter the time quantum: ");
        int timeQuantum = scanner.nextInt();
        scanner.close();

        calculateRoundRobin(processes, timeQuantum);
    }

    public static void calculateRoundRobin(ArrayList<Process> processes, int timeQuantum) {
        Queue<Process> queue = new LinkedList<>();
        ArrayList<Process> completedProcesses = new ArrayList<>();
        int currentTime = 0;

        while (!processes.isEmpty()) {
            for (Process process : processes) {
                if (process.arrivalTime <= currentTime) {
                    queue.add(process);
                    processes.remove(process);
                }
            }

            if (!queue.isEmpty()) {
                Process currentProcess = queue.poll();

                if (currentProcess.remainingBurstTime > timeQuantum) {
                    currentProcess.remainingBurstTime -= timeQuantum;
                    currentTime += timeQuantum;
                } else {
                    currentProcess.remainingBurstTime = 0;
                    currentTime += currentProcess.remainingBurstTime;
                    currentProcess.turnaroundTime = currentTime - currentProcess.arrivalTime;
                    currentProcess.waitingTime = currentProcess.turnaroundTime - currentProcess.burstTime;
                    completedProcesses.add(currentProcess);
                }
            } else {
                currentTime++;
            }
        }

        System.out.println("Gantt Chart:");
        System.out.println("-----------------------------------------------------");
        System.out.println("| Process ID | Burst Time | Waiting Time | Turnaround Time |");
        System.out.println("-----------------------------------------------------");
        for (Process process : completedProcesses) {
            System.out.println("|     " + process.processId + "      |     " + process.burstTime + "       |      " + process.waitingTime + "       |       " + process.turnaroundTime + "       |");
        }
        System.out.println("-----------------------------------------------------");
    }
}

