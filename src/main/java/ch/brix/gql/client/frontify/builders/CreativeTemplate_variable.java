package ch.brix.gql.client.frontify.builders;

public class CreativeTemplate_variable extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreativeTemplateVariable> {
  public CreativeTemplate_variable() {
    super(new ch.brix.gql.client.Call<>("variable", "CreativeTemplateVariable"));
  }
  public CreativeTemplate_variable args(CreativeTemplate_variable_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public CreativeTemplate_variable onCreativeTemplateVariable(On_CreativeTemplateVariable typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
