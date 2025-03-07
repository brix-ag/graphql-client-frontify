package ch.brix.gql.client.frontify.builders;

public class On_MoveFolders extends ch.brix.gql.client.TypeBuilder {
  public On_MoveFolders() {
    super(new ch.brix.gql.client.On("MoveFolders"));
  }
  /**
   * List of moved `Folder` ids.
   */
  public On_MoveFolders ids() {
    _add_field("ids");
    return this;
  }
}
