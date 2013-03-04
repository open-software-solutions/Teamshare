package com.oss.teamwork.teamshare.messaging;

import org.joda.time.DateTime;

import com.oss.teamwork.teamshare.group.Person;
import com.oss.teamwork.teamshare.group.User;

/**
 * Represents a Message transmitted between Teamshare users.
 */
public class Message {
  /**
   * The user that sends the message
   */
  protected User source;

  /**
   * The user that receives the message in its <b>mailbox<b>
   */
  protected Person destination;

  /**
   * The message's status, if it is read, unread etc
   */
  protected MessageStatus status;

  /**
   * The message's content, either generated by the application or input from
   * the user (or combined)
   */
  protected String content;

  protected DateTime date;
  
  
   /**
   * Send the message to the destination by using the configured
   * {@link MessagingService} implementation.
   * 
   * Only messages having their {@link status} {@link MessageStatus.DRAFT} can
   * be sent. For any other status a {@link UnsupportedOperationException} is
   * thrown.
   */
  public void send() {
    if (status != MessageStatus.DRAFT) {
      throw new UnsupportedOperationException(
          "Only draft messages can be sent.");
    }
    
    MessagingServiceProvider.getMessagingService().send(this);
  }

  
  /*  ______________________________________________________________________
   * | Getters and Setters                                                  |
   * |______________________________________________________________________|
  */
  
  public User getSource() {
    return source;
  }

  public void setSource(User source) {
    this.source = source;
  }

  public Person getDestination() {
    return destination;
  }

  public void setDestination(User destination) {
    this.destination = destination;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public MessageStatus getStatus() {
    return status;
  }
  
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public void setDestination(Person destination) {
    this.destination = destination;
  }

  public void setStatus(MessageStatus status) {
    this.status = status;
  }

}
