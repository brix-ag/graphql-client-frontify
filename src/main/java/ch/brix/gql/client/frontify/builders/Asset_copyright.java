package ch.brix.gql.client.frontify.builders;

public class Asset_copyright extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Copyright> {
  public Asset_copyright() {
    super(new ch.brix.gql.client.Call<>("copyright", "Copyright"));
  }
  public Asset_copyright onCopyright(On_Copyright typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
