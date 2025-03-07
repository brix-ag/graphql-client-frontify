package ch.brix.gql.client.frontify.builders;

public class WorkspaceRootFolder_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public WorkspaceRootFolder_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public WorkspaceRootFolder_assets args(WorkspaceRootFolder_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public WorkspaceRootFolder_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
