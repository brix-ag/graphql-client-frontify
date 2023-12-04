package ch.brix.gql.client.frontify.builders;

public class DocumentLibrary_licenses extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.License>> {
  public DocumentLibrary_licenses() {
    super(new ch.brix.gql.client.Call<>("licenses", "License"));
  }
  public DocumentLibrary_licenses onLicense(On_License typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
