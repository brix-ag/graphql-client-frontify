package ch.brix.gql.client.frontify.enums;

/**
 * `WorkspaceProject` state filter.
 */
public enum WorkspaceProjectStateFilter {
  @com.google.gson.annotations.SerializedName("ALL") 
  ALL,
  @com.google.gson.annotations.SerializedName("ACTIVE") 
  ACTIVE,
  @com.google.gson.annotations.SerializedName("ARCHIVED") 
  ARCHIVED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
