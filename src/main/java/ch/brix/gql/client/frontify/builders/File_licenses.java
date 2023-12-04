package ch.brix.gql.client.frontify.builders;

public class File_licenses extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.License>> {
  public File_licenses() {
    super(new ch.brix.gql.client.Call<>("licenses", "License"));
  }
  public File_licenses onLicense(On_License typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
