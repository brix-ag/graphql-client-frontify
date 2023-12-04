package ch.brix.gql.client.frontify.interfaces;

/**
 * `UserInterface` for `User` returnable types.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.AccountUser.class})
public interface User {
  /**
   * `User` Id.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
  /**
   * `User` email.
   */
  ch.brix.gql.client.frontify.scalars.EmailScalar getEmail();
  /**
   * `User` name.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getName();
  /**
   * `User` avatar.
   */
  ch.brix.gql.client.frontify.scalars.UrlScalar getAvatar();
}
