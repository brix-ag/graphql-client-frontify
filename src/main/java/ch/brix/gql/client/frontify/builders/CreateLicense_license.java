package ch.brix.gql.client.frontify.builders;

public class CreateLicense_license extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.License> {
  public CreateLicense_license() {
    super(new ch.brix.gql.client.Call<>("license", "License"));
  }
  public CreateLicense_license onLicense(On_License typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
