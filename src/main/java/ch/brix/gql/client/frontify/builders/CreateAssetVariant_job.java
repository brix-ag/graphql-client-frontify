package ch.brix.gql.client.frontify.builders;

public class CreateAssetVariant_job extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.AssetVariantProcessingJob> {
  public CreateAssetVariant_job() {
    super(new ch.brix.gql.client.Call<>("job", "AssetVariantProcessingJob"));
  }
  public CreateAssetVariant_job onAssetVariantProcessingJob(On_AssetVariantProcessingJob typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
