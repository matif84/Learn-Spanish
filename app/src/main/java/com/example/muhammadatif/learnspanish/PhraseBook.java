package com.example.muhammadatif.learnspanish;

import java.util.Random;

/**
 * Created by muhammadatif on 9/21/14.
 */
public class PhraseBook {

    // Member variable (properties about the object)
    public String[] mFacts = {
            "¿Qué onda? : Whats Up ? ",
            "¡Aguas!: Be Careful ",
            "Estoy crudo:I am Hungover",
            ".Dónde es la peda? : Where's the party ?",
            "Tienes feria?:Do you have the money ?",
            "Qué rollo con el hoyo!:Whats going on ?",
            "¡No manches!: Unbelievable",
            "¡A huevo!: Hell yeah !",
            "Me gustaría comida mexicana : I would like Mexican food",
            "Puede recomendarme un hotel barato? : Can you recommend a cheap hotel?"};

    public String getFact() {




        String fact = "";


        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
