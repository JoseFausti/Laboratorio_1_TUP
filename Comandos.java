Comandos Java


   String Phrase;
        int StringLength;
        String Subphrase;
        int i;
        Phrase = JOptionPane.showInputDialog("Ingrese una frase: ");
        StringLength = Phrase.length();
        JOptionPane.showMessageDialog(null,"La longitud de la cadena es: " + StringLength);
        Subphrase = JOptionPane.showInputDialog("Ingrese la letra que desea buscar: ");

        if (Phrase.contains(Subphrase)){
            JOptionPane.showMessageDialog(null,"La letra "
                    + Subphrase + "se encuentra en la pocision " + (Phrase.indexOf(Subphrase) + 1));
        }else {
            JOptionPane.showMessageDialog(null, "La letra " + Subphrase  +
                    "no se encuentra en la Frase.");
        }
        JOptionPane.showMessageDialog(null,
                "La Frase transformada a mayusculas es " + Phrase.toUpperCase());



        }
}
