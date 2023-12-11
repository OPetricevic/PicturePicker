package com.OmarPetricevic.example;

import com.OmarPetricevic.example.PictureDescriptionForm;

import javax.swing.*;
import java.awt.*;

public class PicturePickerForm {
    private JPanel picturePickerField;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    public PicturePickerForm() {
        button1.addActionListener(e -> openPictureDescriptionForm(
                "heSpokeStyle1.jpeg",
                "A poised gentleman stands against a red brick wall, sporting a tailored sand-colored suit paired with a classic white dress shirt and a brown leather belt. His ensemble is completed with a vintage leather briefcase, adding a touch of retro sophistication.",
                "Consider swapping the briefcase for a canvas messenger bag for a more casual look. A patterned tie or a pocket square could introduce an element of visual interest, while a change to suede derby shoes might soften the formality for less conservative settings."));
        button2.addActionListener(e -> openPictureDescriptionForm(
                "heSpokeStyle2.jpeg",
                "The subject exudes confidence in a light grey two-piece suit with a crisp white shirt. Accessories include a navy blue tie, matching leather shoes, and a sophisticated wristwatch.",
                "To transition this outfit from office to evening wear, one might opt for a black silk tie and patent leather oxfords. For a more relaxed vibe, consider a turtleneck sweater beneath the suit jacket, complemented by loafers."));
        button3.addActionListener(e -> openPictureDescriptionForm(
                "heSpokeStyle3.jpeg",
                "A relaxed yet refined style is showcased with a navy blazer, a light blue dress shirt, and tan chinos. The look is accessorized with a pair of classic brown leather shoes.",
                "For a summery brunch, swap the chinos for white linen pants and the dress shoes for boat shoes or espadrilles. A panama hat could provide both shade and style, while a linen scarf could add a touch of elegance on a breezy day."));
        button4.addActionListener(e -> openPictureDescriptionForm(
                "heSpokeStyle4.jpeg",
                "This dapper outfit features a charcoal grey pinstripe suit, paired with a blue dress shirt and a maroon tie. A pocket square and leather monk strap shoes complete the ensemble.",
                "For a bold statement, the tie could be replaced with a brightly colored bow tie, and the monk straps with velvet loafers. Introduce a patterned pocket square to break the monochromatic theme or consider a waistcoat for layered depth."));
        button5.addActionListener(e -> openPictureDescriptionForm(
                "heSpokeStyle5.jpeg",
                "A sophisticated winter attire consists of a grey overcoat layered over a navy suit, paired with a white dress shirt and a striped tie. The look is polished off with black oxfords.",
                "On colder days, layer with a cashmere scarf and leather gloves. A switch to a turtle neck can offer a modern twist to this classic style. If the occasion is less formal, try a pair of dark jeans and Chelsea boots for a smart-casual approach."));
        button6.addActionListener(e -> openPictureDescriptionForm(
                "heSpokeStyle6.jpeg",
                "A timeless herringbone patterned jacket is worn over a light blue shirt, coupled with dark grey trousers. The look is accented with brown brogues and a leather watch.",
                "Enhance this ensemble with a vibrant pocket square or a knit tie to add texture. For a weekend getaway, switch to loafers, roll up the sleeves, and replace the trousers with navy chinos."));
        button7.addActionListener(e -> openPictureDescriptionForm(
                "heSpokeStyle7.jpeg",
                "A casual Friday look is captured with a light grey blazer, white shirt, and dark denim jeans. A pair of white sneakers adds a contemporary edge.",
                "Experiment by layering with a graphic tee underneath the blazer, or trade the jeans for colored chinos. Accessorize with a beaded bracelet and switch the sneakers for suede driving shoes to vary the casual aesthetic."));
        button8.addActionListener(e -> openPictureDescriptionForm(
                "heSpokeStyle8.jpeg",
                "The subject steps out in a sharp evening attire featuring a dark navy suit, paired with a light grey vest and dress shirt. The outfit is accessorized with a tie clip and a black leather strap watch.",
                "For an invitation to an upscale dinner, consider a silk scarf and cufflinks. A bow tie could replace the traditional tie for a touch of classic charm. In cooler weather, a dark trench coat would provide both warmth and elegance."));
        button9.addActionListener(e -> openPictureDescriptionForm(
                "heSpokeStyle9.jpeg",
                "Showcasing a relaxed summer style, the individual wears a beige linen blazer over a pastel pink shirt, complemented with light-colored trousers and brown loafers.",
                "Adopt a coastal vibe by donning a straw boater hat and swapping the trousers for tailored shorts. A patterned ascot could add flair, while espadrilles would cement the outfit's laid-back nature."));
    }


    private void openPictureDescriptionForm(String imageName, String description, String styleOptionDescription) {
        PictureDescriptionForm descriptionForm = new PictureDescriptionForm(imageName, description, styleOptionDescription);
        JFrame frame = new JFrame("Picture Description");
        frame.setContentPane(descriptionForm.getPictureDescriptionPanel());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(picturePickerField);
        if (topFrame != null) {
            topFrame.dispose();
        }    }

    public JPanel getPicturePickerField() {
        return picturePickerField;
    }

    private ImageIcon getScaledImageIcon(String path, int width, int height) {
        ImageIcon originalIcon = new ImageIcon(getClass().getResource("/Images/" + path));
        Image originalImage = originalIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }

}
