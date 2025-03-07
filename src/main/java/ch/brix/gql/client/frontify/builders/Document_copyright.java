package ch.brix.gql.client.frontify.builders;

public class Document_copyright extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.Copyright> {
  public Document_copyright() {
    super(new ch.brix.gql.client.Call<>("copyright", "Copyright"));
  }
  public Document_copyright onCopyright(On_Copyright typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
