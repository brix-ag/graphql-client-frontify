package ch.brix.gql.client.frontify.builders;

public class Asset_licenses extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.License>> {
  public Asset_licenses() {
    super(new ch.brix.gql.client.Call<>("licenses", "License"));
  }
  public Asset_licenses onLicense(On_License typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
