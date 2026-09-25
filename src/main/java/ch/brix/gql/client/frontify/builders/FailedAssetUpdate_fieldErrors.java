package ch.brix.gql.client.frontify.builders;

public class FailedAssetUpdate_fieldErrors extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.AssetFieldError>> {
  public FailedAssetUpdate_fieldErrors() {
    super(new ch.brix.gql.client.Call<>("fieldErrors", "AssetFieldError"));
  }
  public FailedAssetUpdate_fieldErrors onAssetFieldError(On_AssetFieldError typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
