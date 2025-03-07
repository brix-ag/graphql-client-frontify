package ch.brix.gql.client.frontify.builders;

public class CreateExternalAsset_job extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetProcessingJob> {
  public CreateExternalAsset_job() {
    super(new ch.brix.gql.client.Call<>("job", "AssetProcessingJob"));
  }
  public CreateExternalAsset_job onAssetProcessingJob(On_AssetProcessingJob typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
