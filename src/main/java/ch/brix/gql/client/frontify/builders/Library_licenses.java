package ch.brix.gql.client.frontify.builders;

public class Library_licenses extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.License>> {
  public Library_licenses() {
    super(new ch.brix.gql.client.Call<>("licenses", "License"));
  }
  public Library_licenses onLicense(On_License typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
