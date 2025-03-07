package ch.brix.gql.client.frontify.builders;

public class CreativeTemplate_variables extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.CreativeTemplateVariable>> {
  public CreativeTemplate_variables() {
    super(new ch.brix.gql.client.Call<>("variables", "CreativeTemplateVariable"));
  }
  public CreativeTemplate_variables onCreativeTemplateVariable(On_CreativeTemplateVariable typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
