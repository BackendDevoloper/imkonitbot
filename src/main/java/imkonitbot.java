import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class imkonitbot extends TelegramLongPollingBot {



    @Override
    public void onUpdateReceived(Update update) {
        System.out.println("salom hammaga");
    }

    @Override
    public String getBotUsername() {
        return "imkonit_bot";
    }
    @Override
    public String getBotToken() {
        return "5236876239:AAFPm12-tM5lIk-jJd8ZNufc-PW-ciK1-Do";
    }
}
