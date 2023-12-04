package ch.brix.gql.client.frontify.builders;

public class RootMutation_addAssetPreviewImage extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AddAssetPreviewImage> {
  public RootMutation_addAssetPreviewImage() {
    super(new ch.brix.gql.client.Call<>("addAssetPreviewImage", "AddAssetPreviewImage"));
  }
  public RootMutation_addAssetPreviewImage args(RootMutation_addAssetPreviewImage_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_addAssetPreviewImage onAddAssetPreviewImage(On_AddAssetPreviewImage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
