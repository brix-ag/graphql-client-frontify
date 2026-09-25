package ch.brix.gql.client.frontify.enums;

/**
 * Search sources option. Defines the location of the search results.
 */
public enum BrandSearchQuerySource {
  /**
   * Search for the results in `Libraries`.
   */
  @com.google.gson.annotations.SerializedName("LIBRARIES") 
  LIBRARIES,
  /**
   * Search for the results in the `WorkspaceProjects`.
   */
  @com.google.gson.annotations.SerializedName("WORKSPACE_PROJECTS") 
  WORKSPACE_PROJECTS,
  /**
   * Search for the results in the whole `Brand`.
   */
  @com.google.gson.annotations.SerializedName("EVERYWHERE") 
  EVERYWHERE,
  /**
   * Search for the results in the `LibraryPages`.
   */
  @com.google.gson.annotations.SerializedName("LIBRARY_VIEWS") 
  LIBRARY_VIEWS;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
