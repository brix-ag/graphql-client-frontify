package ch.brix.gql.client.frontify.builders;

public class Workspace_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetItems> {
  public Workspace_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "AssetItems"));
  }
  public Workspace_assets args(Workspace_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Workspace_assets onAssetItems(On_AssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
