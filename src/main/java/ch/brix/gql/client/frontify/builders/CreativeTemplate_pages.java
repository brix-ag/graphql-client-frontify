package ch.brix.gql.client.frontify.builders;

public class CreativeTemplate_pages extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CreativeTemplatePage>> {
  public CreativeTemplate_pages() {
    super(new ch.brix.gql.client.Call<>("pages", "CreativeTemplatePage"));
  }
  public CreativeTemplate_pages onCreativeTemplatePage(On_CreativeTemplatePage typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
