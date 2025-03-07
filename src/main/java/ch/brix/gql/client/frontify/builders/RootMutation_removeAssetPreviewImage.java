package ch.brix.gql.client.frontify.builders;

public class RootMutation_removeAssetPreviewImage extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.RemoveAssetPreviewImage> {
  public RootMutation_removeAssetPreviewImage() {
    super(new ch.brix.gql.client.Call<>("removeAssetPreviewImage", "RemoveAssetPreviewImage"));
  }
  public RootMutation_removeAssetPreviewImage args(RootMutation_removeAssetPreviewImage_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootMutation_removeAssetPreviewImage onRemoveAssetPreviewImage(On_RemoveAssetPreviewImage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
