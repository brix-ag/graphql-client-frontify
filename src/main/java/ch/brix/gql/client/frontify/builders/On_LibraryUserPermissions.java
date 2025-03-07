package ch.brix.gql.client.frontify.builders;

public class On_LibraryUserPermissions extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryUserPermissions() {
    super(new ch.brix.gql.client.On("LibraryUserPermissions"));
  }
  /**
   * Check if current `User` has `Asset` creation permissions in a specific `Library`.
   */
  public On_LibraryUserPermissions canCreateAssets() {
    _add_field("canCreateAssets");
    return this;
  }
  /**
   * Check if current `User` has `Collaborator` view permissions in a specific `Library`.
   */
  public On_LibraryUserPermissions canViewCollaborators() {
    _add_field("canViewCollaborators");
    return this;
  }
  /**
   * Check if current `User` has `Collection` creation permissions in a specific `Library`.
   */
  public On_LibraryUserPermissions canCreateCollections() {
    _add_field("canCreateCollections");
    return this;
  }
}
