package ch.brix.gql.client.frontify.enums;

public enum SecurityScope {
  @com.google.gson.annotations.SerializedName("BASIC_READ") 
  BASIC_READ,
  @com.google.gson.annotations.SerializedName("BASIC_WRITE") 
  BASIC_WRITE,
  @com.google.gson.annotations.SerializedName("ACCOUNT_READ") 
  ACCOUNT_READ,
  @com.google.gson.annotations.SerializedName("WEBHOOK_READ") 
  WEBHOOK_READ,
  @com.google.gson.annotations.SerializedName("WEBHOOK_WRITE") 
  WEBHOOK_WRITE;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
