package com.schneewittchen.rosandroid.widgets.buttonsubscriber;

import com.schneewittchen.rosandroid.model.entities.widgets.SubscriberLayerEntity;
import com.schneewittchen.rosandroid.model.entities.widgets.SubscriberWidgetEntity;
import com.schneewittchen.rosandroid.model.repositories.rosRepo.message.Topic;


import std_msgs.UInt8;


/**
 * @author jbravo@uma.es (Juan Bravo-Arrabal)
 */

public class ButtonSubscriberEntity extends SubscriberWidgetEntity {
    final String text3;
    public String text2;
    public String text;
    public int rotation2;

    public ButtonSubscriberEntity() {
        this.width = 3;
        this.height = 1;
        this.topic = new Topic("/warning", UInt8._TYPE);
        this.text = "Safe";
        this.text2 = "Caution!";
        this.text3 = "Dangerous!";
        this.rotation2 = 0;
    }
}


