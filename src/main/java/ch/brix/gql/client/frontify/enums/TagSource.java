package ch.brix.gql.client.frontify.enums;

/**
 * The source of a `tag`.
 */
public enum TagSource {
  @com.google.gson.annotations.SerializedName("MANUAL") 
  MANUAL,
  @com.google.gson.annotations.SerializedName("AUTO") 
  AUTO;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
