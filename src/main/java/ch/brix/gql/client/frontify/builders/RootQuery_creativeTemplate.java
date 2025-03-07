package ch.brix.gql.client.frontify.builders;

public class RootQuery_creativeTemplate extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.CreativeTemplate> {
  public RootQuery_creativeTemplate() {
    super(new ch.brix.gql.client.Call<>("creativeTemplate", "CreativeTemplate"));
  }
  public RootQuery_creativeTemplate args(RootQuery_creativeTemplate_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public RootQuery_creativeTemplate onCreativeTemplate(On_CreativeTemplate typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
