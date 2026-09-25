package ch.brix.gql.client.frontify.enums;

public enum CatalogColumnRemovalMode {
  @com.google.gson.annotations.SerializedName("SAFE") 
  SAFE,
  @com.google.gson.annotations.SerializedName("FORCE") 
  FORCE;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
