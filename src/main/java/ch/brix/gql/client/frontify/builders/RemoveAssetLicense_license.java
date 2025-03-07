package ch.brix.gql.client.frontify.builders;

public class RemoveAssetLicense_license extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.License> {
  public RemoveAssetLicense_license() {
    super(new ch.brix.gql.client.Call<>("license", "License"));
  }
  public RemoveAssetLicense_license onLicense(On_License typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
