package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class LibraryUserPermissions {
  /**
   * Check if current `User` has `Asset` creation permissions in a specific `Library`.
   */
  @com.google.gson.annotations.SerializedName("canCreateAssets")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canCreateAssets;
  /**
   * Check if current `User` has `Collaborator` view permissions in a specific `Library`.
   */
  @com.google.gson.annotations.SerializedName("canViewCollaborators")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canViewCollaborators;
  /**
   * Check if current `User` has `Collection` creation permissions in a specific `Library`.
   */
  @com.google.gson.annotations.SerializedName("canCreateCollections")
  private ch.brix.gql.client.frontify.scalars.BooleanScalar canCreateCollections;
}
