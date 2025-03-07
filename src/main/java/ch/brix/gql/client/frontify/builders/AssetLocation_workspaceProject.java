package ch.brix.gql.client.frontify.builders;

public class AssetLocation_workspaceProject extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetLocationWorkspaceProject> {
  public AssetLocation_workspaceProject() {
    super(new ch.brix.gql.client.Call<>("workspaceProject", "AssetLocationWorkspaceProject"));
  }
  public AssetLocation_workspaceProject onAssetLocationWorkspaceProject(On_AssetLocationWorkspaceProject typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
