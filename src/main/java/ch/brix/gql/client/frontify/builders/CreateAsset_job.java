package ch.brix.gql.client.frontify.builders;

public class CreateAsset_job extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetProcessingJob> {
  public CreateAsset_job() {
    super(new ch.brix.gql.client.Call<>("job", "AssetProcessingJob"));
  }
  public CreateAsset_job onAssetProcessingJob(On_AssetProcessingJob typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
