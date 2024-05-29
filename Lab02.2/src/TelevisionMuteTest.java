class TelevisionMuteTest {
    public static void main(String[] args) {
        // mute()
        Television tv3 = new Television("Samsung", 32);
        System.out.println(tv3);

        // mute it
        tv3.mute();
        System.out.println(tv3);

        // unmute it
        tv3.mute();
        System.out.println(tv3);

        // mute it again
        tv3.mute();
        System.out.println(tv3);

        // set volume to 50 and unmutes it
        tv3.setVolume(50);
        System.out.println(tv3);
    }
}