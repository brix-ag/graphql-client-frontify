package ch.brix.gql.client.frontify.builders;

public class UpdateAssets_failedAssets extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.FailedAssetUpdate>> {
  public UpdateAssets_failedAssets() {
    super(new ch.brix.gql.client.Call<>("failedAssets", "FailedAssetUpdate"));
  }
  public UpdateAssets_failedAssets onFailedAssetUpdate(On_FailedAssetUpdate typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
