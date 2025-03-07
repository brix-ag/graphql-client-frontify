package ch.brix.gql.client.frontify.builders;

public class Brand_creativeTemplates extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreativeTemplateItems> {
  public Brand_creativeTemplates() {
    super(new ch.brix.gql.client.Call<>("creativeTemplates", "CreativeTemplateItems"));
  }
  public Brand_creativeTemplates args(Brand_creativeTemplates_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public Brand_creativeTemplates onCreativeTemplateItems(On_CreativeTemplateItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
