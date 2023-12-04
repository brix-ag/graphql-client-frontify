package ch.brix.gql.client.frontify.builders;

public class AddAssetPreviewImage_job extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetPreviewProcessingJob> {
  public AddAssetPreviewImage_job() {
    super(new ch.brix.gql.client.Call<>("job", "AssetPreviewProcessingJob"));
  }
  public AddAssetPreviewImage_job onAssetPreviewProcessingJob(On_AssetPreviewProcessingJob typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
