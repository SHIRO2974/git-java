package chapter10;

//      === 이벤트 관리 시스템 ===

import java.util.ArrayList;
import java.util.LinkedList;

class EventManagement {
    // === 필드 ===
    ArrayList<String> participantList = new ArrayList<>();

    LinkedList<String> waitingQueue = new LinkedList<>();

    // === 메서드 ===
    void addParticipant(String name) {
        participantList.add(name);
    }

    void addToWaitingQueue(String name) {
        waitingQueue.add(name);

    }

    void leaveParticipant(String name) {
        if (waitingQueue.size() > 0) {
            String nextParticipant = waitingQueue.remove(0);
            addParticipant(nextParticipant);
        }
    }

    boolean checkParticipant(String name) {
        return participantList.contains(name);
    }
}

public class C_ListPractice {
    public static void main(String[] args) {
        EventManagement eventManagement = new EventManagement();

        eventManagement.addParticipant("이재현");
        eventManagement.addParticipant("이재이");
        eventManagement.addParticipant("이재흐");
        eventManagement.addParticipant("이재자");
        eventManagement.addParticipant("이재하");
        eventManagement.addParticipant("이재비");


        eventManagement.addToWaitingQueue("아무개");
        eventManagement.addToWaitingQueue("아무삼");
        eventManagement.addToWaitingQueue("아무자");
        eventManagement.addToWaitingQueue("아무하");

        System.out.println(eventManagement.participantList);    // [이재현, 이재이, 이재흐, 이재자, 이재하, 이재비]
        System.out.println(eventManagement.waitingQueue);       // [아무개, 아무삼, 아무자, 아무하]

        eventManagement.leaveParticipant("이재이");
        System.out.println(eventManagement.participantList);
        // [이재현, 이재이, 이재흐, 이재자, 이재하, 이재비, 아무개]

        eventManagement.leaveParticipant("이재비");
        System.out.println(eventManagement.participantList);
        // [이재현, 이재이, 이재흐, 이재자, 이재하, 이재비, 아무개, 아무삼]

        System.out.println(eventManagement.checkParticipant("이재현"));    // true
        System.out.println(eventManagement.checkParticipant("아무자"));    // false

        System.out.println(eventManagement.waitingQueue);   // [아무자, 아무하]

    }
}
