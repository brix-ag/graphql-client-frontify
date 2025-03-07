package ch.brix.gql.client.frontify.builders;

public class On_AssetLocation extends ch.brix.gql.client.TypeBuilder {
  public On_AssetLocation() {
    super(new ch.brix.gql.client.On("AssetLocation"));
  }
  /**
   * `Brand` location of the `Asset`.
   */
  public On_AssetLocation brand(AssetLocation_brand callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Library` location of the `Asset`.
   */
  public On_AssetLocation library(AssetLocation_library callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `WorkspaceProject` location of the `Asset`.
   */
  public On_AssetLocation workspaceProject(AssetLocation_workspaceProject callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * `Folder` location of the `Asset`.
   */
  public On_AssetLocation folder(AssetLocation_folder callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
