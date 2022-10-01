package c.inner;

import java.util.EventListener;

public class AnonymousSample {
    class MagicButtonListener implements EventListener {
        public void onClick() {
            System.out.println("Magic Button Clicked !!");
        }
    }

    public static void main(String[] args) {
        AnonymousSample sample = new AnonymousSample();
        sample.setButtonlistener();
        sample.setButtonlistenerAnonymous();
        sample.setButtonlistenerAnonymousObject();
    }

    public void setButtonlistener() {
        MagicButton button = new MagicButton();
        MagicButtonListener listener = new MagicButtonListener();
        button.setListener(listener);
        button.onClickProcess();
    }

    public void setButtonlistenerAnonymous() {
        MagicButton button = new MagicButton();
        button.setListener(new EventListener() {
            public void onClick() {
                System.out.println("Magic Button Clicked !!");
            }
        });
        button.onClickProcess();
    }

    public void setButtonlistenerAnonymousObject() {
        MagicButton button = new MagicButton();
        EventListener listener = new EventListener() {
            public void onClick() {
                System.out.println("Magic Button Clicked!!");
            }
        };
        button.setListener(listener);
        button.onClickProcess();
    }
}
