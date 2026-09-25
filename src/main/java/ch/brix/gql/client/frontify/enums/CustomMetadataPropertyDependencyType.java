package ch.brix.gql.client.frontify.enums;

/**
 * List of possible `CustomMetadataPropertyDependency` types.
 */
public enum CustomMetadataPropertyDependencyType {
  @com.google.gson.annotations.SerializedName("FILLED") 
  FILLED,
  @com.google.gson.annotations.SerializedName("SELECT_EQUALS") 
  SELECT_EQUALS,
  @com.google.gson.annotations.SerializedName("SELECT_ONE_OF") 
  SELECT_ONE_OF;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
