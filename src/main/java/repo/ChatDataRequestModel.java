package repo;

import entities.Pet;
import entities.User;
import entities.Chat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public interface ChatDataRequestModel {


    /**
     * Get all chats from the database by pet
     * @param pet the pet entity
     * @return an arraylist of chat entities
     */
    ArrayList<Chat> getChatsByPet(Pet pet);

    /**
     * Get a chat given the chatID.
     * @param chatID chat ID
     * @return Chat
     */
    Chat getChatByID(String chatID);

    /**
     * Saves chat in database. Returns true if saved, false if not.
     * @param pet1ID, pet2ID, chat
     * @return true if saved, false if not
     */
    boolean saveChat(String pet1ID, String pet2ID, Chat chat);


}
