package ch.brix.gql.client.frontify.builders;

public class CreativeTemplateItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CreativeTemplate>> {
  public CreativeTemplateItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "CreativeTemplate"));
  }
  public CreativeTemplateItems_items onCreativeTemplate(On_CreativeTemplate typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
