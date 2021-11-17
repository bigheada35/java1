class SinivelCap2 {    // 콧물 처치용 캡슐
    void take() {
        System.out.println("콧물이 싹~ 납니다.");
    }
}

class SneezeCap2 {    // 재채기 처치용 캡슐
    void take() {
        System.out.println("재채기가 멎습니다.");
    }
}

class SnuffleCap2 {    // 코막힘 처치용 캡슐
    void take() {
        System.out.println("코가 뻥 뚫립니다.");
    }
}

class SinusCap {
    SinivelCap2 siCap = new SinivelCap2();
    SneezeCap2 szCap = new SneezeCap2();
    SnuffleCap2 sfCap = new SnuffleCap2();

    void take() {
        siCap.take();
        szCap.take();
        sfCap.take();
    }
}

class ColdPatient2 {
    void takeSinus(SinusCap cap) {
        cap.take();
    }
}

class CompEncapsulation {
    public static void main(String[] args) {
        ColdPatient2 suf = new ColdPatient2();
        suf.takeSinus(new SinusCap());
    }
}