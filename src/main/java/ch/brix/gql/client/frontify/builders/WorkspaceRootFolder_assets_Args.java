package ch.brix.gql.client.frontify.builders;

public class WorkspaceRootFolder_assets_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * How many `AssetItems` to show per query. Min: 1, Max: 100.
   * Default value: 25
   */
  public WorkspaceRootFolder_assets_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
  /**
   * Current `AssetItems` listing page number.
   * Default value: 1
   */
  public WorkspaceRootFolder_assets_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
  /**
   * **BETA** Define search criteria for the `AssetItems` in the `Library`/`Workspace`.
   * Default value: null
   */
  public WorkspaceRootFolder_assets_Args query(ch.brix.gql.client.frontify.input_objects.FolderAssetQueryInput value) {
    _add_arg("query", value);
    return this;
  }
}
