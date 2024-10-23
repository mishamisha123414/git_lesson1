package lesson_11;

abstract class MusicStyles {
    abstract void playMusic();
}

class PopMusic extends MusicStyles {
    @Override
    void playMusic() {
        System.out.println("Playing pop music...");
    }
}

class RockMusic extends MusicStyles {
    @Override
    void playMusic() {
        System.out.println("Playing rock music...");
    }
}

class ClassicMusic extends MusicStyles {
    @Override
    void playMusic() {
        System.out.println("Playing classical music...");
    }
}

 class Main {
    public static void main(String[] args) {

        MusicStyles[] popBands = {new PopMusic()};
        MusicStyles[] rockBands = {new RockMusic()};
        MusicStyles[] classicBands = {new ClassicMusic()
            };


        for (MusicStyles band : popBands) {
            band.playMusic();
        }
        for (MusicStyles band : rockBands) {
            band.playMusic();
        }
        for (MusicStyles band : classicBands) {
            band.playMusic();
        }
    }
}
