package ch.brix.gql.client.frontify.builders;

public class On_AssetLocationWorkspaceProject extends ch.brix.gql.client.TypeBuilder {
  public On_AssetLocationWorkspaceProject() {
    super(new ch.brix.gql.client.On("AssetLocationWorkspaceProject"));
  }
  /**
   * `WorkspaceProject` Id.
   */
  public On_AssetLocationWorkspaceProject id() {
    _add_field("id");
    return this;
  }
  /**
   * `WorkspaceProject` name.
   */
  public On_AssetLocationWorkspaceProject name() {
    _add_field("name");
    return this;
  }
}
