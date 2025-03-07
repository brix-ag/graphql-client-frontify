package ch.brix.gql.client.frontify.builders;

public class AddAssetLicense_license extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.License> {
  public AddAssetLicense_license() {
    super(new ch.brix.gql.client.Call<>("license", "License"));
  }
  public AddAssetLicense_license onLicense(On_License typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
