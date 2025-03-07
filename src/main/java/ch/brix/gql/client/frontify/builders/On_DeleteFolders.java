package ch.brix.gql.client.frontify.builders;

public class On_DeleteFolders extends ch.brix.gql.client.TypeBuilder {
  public On_DeleteFolders() {
    super(new ch.brix.gql.client.On("DeleteFolders"));
  }
  /**
   * List of the deleted `Folder` ids.
   */
  public On_DeleteFolders ids() {
    _add_field("ids");
    return this;
  }
}
