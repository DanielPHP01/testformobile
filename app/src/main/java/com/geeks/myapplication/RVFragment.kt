package com.geeks.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.geeks.myapplication.databinding.FragmentRVBinding


class RVFragment : Fragment() {

    private lateinit var binding: FragmentRVBinding
    private lateinit var cakesAdapter: CakesAdapter
    private val cakesList = ArrayList<Cakes>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRVBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onLoad()
        initRV()
    }

    private fun initRV() {
        cakesAdapter = CakesAdapter(cakesList) {
            findNavController().navigate(RVFragmentDirections.actionRVFragmentToDetailFragment2(image = cakesList[it].image, name = cakesList[it].name, desc = cakesList[it].desc, price = cakesList[it].price))
//            findNavController().navigate(R.id.action_RVFragment_to_detailFragment2, bundle)
//            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment_container, detailFragment).addToBackStack(null).commit()
        }
        binding.rvFruits.adapter = cakesAdapter
    }

    private fun onLoad() {
        cakesList.add(
            Cakes(
                image1,
                "Три шоколада",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image1,
                "Три шоколада",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image1,
                "Три шоколада",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image1,
                "Три шоколада",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image1,
                "Три шоколада",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image1,
                "Три шоколада",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image1,
                "Три шоколада",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image1,
                "Три шоколада",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image1,
                "Три шоколада",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image2,
                "Йогуртовый торт",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image2,
                "Йогуртовый торт",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image2,
                "Йогуртовый торт",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image2,
                "Йогуртовый торт",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image2,
                "Йогуртовый торт",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image2,
                "Йогуртовый торт",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image2,
                "Йогуртовый торт",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image2,
                "Йогуртовый торт",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image2,
                "Йогуртовый торт",
                "\n" +
                        "Биздин жаңы пирогдорду татып көрүңүз: тоок эти жана шпинат, тоок эти жана козу карын, лосось (сом балык) жана помидор + сүйүктүү капучино же латте (400 мл)! Комбонун баасы (259 же 279 сом) пирогдун түрүнө жараша болот.\n",
                "1500000"
            )
        )
        cakesList.add(
            Cakes(
                image3,
                "Торт 'Медовик'",
                "Медовик — один из самых популярных тортов в России. Его готовят из нежных коржей, пропитанных медовым сиропом, и сливочного крема. Торт получается очень вкусным и ароматным. Попробуйте приготовить медовик по нашему рецепту, и он обязательно понравится вам и вашим близким.",
                "1500000"
            )
        )

        cakesList.add(
            Cakes(
                image3,
                "Торт 'Медовик'",
                "Медовик — один из самых популярных тортов в России. Его готовят из нежных коржей, пропитанных медовым сиропом, и сливочного крема. Торт получается очень вкусным и ароматным. Попробуйте приготовить медовик по нашему рецепту, и он обязательно понравится вам и вашим близким.",
                "1500000"
            )
        )

        cakesList.add(
            Cakes(
                image3,
                "Торт 'Медовик'",
                "Медовик — один из самых популярных тортов в России. Его готовят из нежных коржей, пропитанных медовым сиропом, и сливочного крема. Торт получается очень вкусным и ароматным. Попробуйте приготовить медовик по нашему рецепту, и он обязательно понравится вам и вашим близким.",
                "1500000"
            )
        )

        cakesList.add(
            Cakes(
                image3,
                "Торт 'Медовик'",
                "Медовик — один из самых популярных тортов в России. Его готовят из нежных коржей, пропитанных медовым сиропом, и сливочного крема. Торт получается очень вкусным и ароматным. Попробуйте приготовить медовик по нашему рецепту, и он обязательно понравится вам и вашим близким.",
                "1500000"
            )
        )

        cakesList.add(
            Cakes(
                image3,
                "Торт 'Медовик'",
                "Медовик — один из самых популярных тортов в России. Его готовят из нежных коржей, пропитанных медовым сиропом, и сливочного крема. Торт получается очень вкусным и ароматным. Попробуйте приготовить медовик по нашему рецепту, и он обязательно понравится вам и вашим близким.",
                "1500000"
            )
        )

        cakesList.add(
            Cakes(
                image3,
                "Торт 'Медовик'",
                "Медовик — один из самых популярных тортов в России. Его готовят из нежных коржей, пропитанных медовым сиропом, и сливочного крема. Торт получается очень вкусным и ароматным. Попробуйте приготовить медовик по нашему рецепту, и он обязательно понравится вам и вашим близким.",
                "1500000"
            )
        )

        cakesList.add(
            Cakes(
                image3,
                "Торт 'Медовик'",
                "Медовик — один из самых популярных тортов в России. Его готовят из нежных коржей, пропитанных медовым сиропом, и сливочного крема. Торт получается очень вкусным и ароматным. Попробуйте приготовить медовик по нашему рецепту, и он обязательно понравится вам и вашим близким.",
                "1500000"
            )
        )

        cakesList.add(
            Cakes(
                image3,
                "Торт 'Медовик'",
                "Медовик — один из самых популярных тортов в России. Его готовят из нежных коржей, пропитанных медовым сиропом, и сливочного крема. Торт получается очень вкусным и ароматным. Попробуйте приготовить медовик по нашему рецепту, и он обязательно понравится вам и вашим близким.",
                "1500000"
            )
        )

        cakesList.add(
            Cakes(
                image3,
                "Торт 'Медовик'",
                "Медовик — один из самых популярных тортов в России. Его готовят из нежных коржей, пропитанных медовым сиропом, и сливочного крема. Торт получается очень вкусным и ароматным. Попробуйте приготовить медовик по нашему рецепту, и он обязательно понравится вам и вашим близким.",
                "1500000"
            )
        )

        cakesList.add(
            Cakes(
                image3,
                "Торт 'Медовик'",
                "Медовик — один из самых популярных тортов в России. Его готовят из нежных коржей, пропитанных медовым сиропом, и сливочного крема. Торт получается очень вкусным и ароматным. Попробуйте приготовить медовик по нашему рецепту, и он обязательно понравится вам и вашим близким.",
                "1500000"
            )
        )

    }
}

const val image1 =
    "data:image/jpeg;base64,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"
const val image2 =
    "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxISEhAQEhIQDxAQEA8PEA8QEBAPDw8PFRUWFhURFRUYHSggGBolGxUVITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGhAQGi0fHR8tLS0tLSstLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIAOEA4QMBEQACEQEDEQH/xAAbAAACAwEBAQAAAAAAAAAAAAACAwEEBQAGB//EADgQAAEDAgQDBQYFBAMBAAAAAAEAAhEDBAUSITFBUXEGE2GBkRUiMkKhsRRSwdHhYnLw8QcjgpL/xAAbAQADAQEBAQEAAAAAAAAAAAAAAQIDBAUGB//EAC4RAAICAQQCAQMEAgEFAAAAAAABAhEDBBIhMRNBUQUUYSIycZGBoRUjM0LB8P/aAAwDAQACEQMRAD8A+sBSMlAHIAlAHIA5AHJASmByQHIApYjb5mrm1WFZYNM3w5NsjKta0HKeC+JyKWGbhI9elJWi+2sFSmqMnFi6tQLnyzhXJcYsyrsE7BcsKR24+OzPFsQ4O2XT5E1Rs2pI26FIELnUL9nFOTixopAcFW2KI3Ni67JCmTvkqDpnnb2mabw8efRdeOSnHaz0YtTjRtW1XO0FcM47XRxSjtZLkIAHBNAZ1enldmC6YvcqOnG90aZZJBErLpmLVOitxWvo2XQ1uihj7PQ4RdSIO4X1v0fW+SGyT5R4euwbZbkaEr3DzQwqESgDkAcgCUAckByAOQBKAOQBBCAPP4zb5TnHmvnvrGi3x3x7R6ejzf8AixFi/NxXy8I/qpndPg0O6C1ligZbmCaQWDxxHvZRu6Kyi6dHTimKsa8HKVo+P1I0zQtWjSTOMgoGZ2IW8gpQltkdOGdMz8MrZHFh8ui2zR3Lcjozwtbka7guNHIhZVAIuGggq4OmXDhle1O4Ws/k2yr2NNNRuMtxMIKTG29UtMha4c8sM1OJOSCnGmaPtML3P+bXwzg+xNoL6s8UklIATVHNFj2sWbpqVlbGA69aEbkV4mD7QaluQeKRHtFqNyDxMluJMPEJ7kJ4pFinctdsQnZDi0NQIlAFa9oZ2kKMkFKNMuEtrs8pTJpPLDz06L4X6hpnhyuj3Mc/JCzYo1JC5oytEtDJSfJIuqyQsZwLjKjJuqRBkIhK+Gd2OVqmXbGvmEKl+l0znzY9rHOKynJpmSAeJCndZa4MXEaEHMNwuvDO1TO/DNSVMu2dbM0LDJHbI58kNsgyFJJ2RFhZRrMyukbLeL3Kjog90aZbGolZdM52qdAkJjQsqkaoDMnQ6PX1a4aF+kt0fKRg2ZdxdOJ0WEsp1wwpLkWJPFTvNKiggxvFynyR+RW/gkNYeP1S8iYOTRFOi2Vk8lMJTbRY/DsIW8ZpmW6SZTr4Y0zEjoVobLM/ZhXj6tB4cHEtkSDyU7mmbeKOSPXJ7bDa+dgdzC6Ezypxp0WZRZNAl6TkOjzfaK1+du41Xj/U9P5YWu0d+kybXTKuH3UgL43JBxZ6TRq03Srg7Ri0GU5CK1xTlcz4dm0JUZkljvBbfuR2cTiabHyJXPJv2cbjTIJSCivcszBaQdM2xvayjZuyOLSt8i3KzoyrfG0aRC5jkBhMYqvTkKoumVCVMRbOj3StJq+TXIr5Qx5UohIWAqKByp2Fl99wSZO3JfbZdQeZHFGKpdlevcHyXnz1v6qKWMrVMSA4qJaqRLgjBxLFas+6dFhHLKT5Y6RGG4pV4mVazvG+ynBSRsU8UcjLq6XBMcSbL1lfF26nDr3dMuWBGma2i9zDl3I5ZY+Tyna7EWspuk6rSTOvAqVs3exGI95bsP8ASFrGXB5mdLe6PQuqp7jGgDUSsdCbhocCFMlaoadM8ncHuqkcCV8v9R0u2Vr2etgybo0bFpcSF4luDNGi6HrRytGdAuK55FIo3VOU4So6ccqFWryDlKvIk+UXkimrRehYWc1gkJjTKN5R+Ybhb45emdWKfpjbSrmHioyRpmeWG1jioIQtzlSRSRSuDBBW8Fao6IK1RZbBErJ8GL4dHEJgLhUA64bqvptXlWNcnDDkycTrECAvLxZFOXRpJUjGDzBJXozhceDl3cmVXxdmoJEhZx00u0WpoPCcVaXZUs+maVlb0ejYNJGq45YWOMzRsAdysYwe9Gydos3d0GNJJjRfT6biJltPlnarFe9eQDIC6ex5JKMaR9D/AOO3Rbs/tWiPMn2epdVTJoWa6AANwgRjY40OEjdc2pwrJGjbDk2szsOviPdO4Xyeo0+1nqpqSs3qFxK4GnEGiyNVlTYgu7V7OBbipcU41CcJejeEr4G0KkhRKNMicaYZKkkB4lUio8FANLXabFb3uidNqUS25ZIwRACLHYq4pyFcHTLxypiLZ8e6Vc1fJrkjfKLBWZiAqEVKteoZEea+g1WGc3yjijJR6KdwwxruueKji9CbcjIviQ0wJW8Mrk/wRtSPM1sDqVHTESvQhm2xMmjUwTsw9rpMnxWOXUbuKHGJ7WjbtptlxGnNc3jlJnTjx2ZuI9paVIGCNF34NIu2jWVRPD412pfWlrdGr0FjSRzyzL0YbRPmijBybPrHZG6DKLRtoE0YSNh+JDmmQV34kEwK9TEkyaK77yd0xdGbWfDswXla3S7uUd+nzembOG34MCV8znwtM7+zcoVVxNUxNFkOS3WRQFUKemVFlKcp8Fr2jp/ciyDKzqjGqIKAE1WK4s0jImm+UNBJUSUhIEpjKtdkGQtovijeDtUOY+QoaozapgoIPDntv/Qvv3is4ns+ST2yafiaVx59D5EVCUSzQ7Q27jqW+qxWhcY0glG2WanaO1aJzN9VUNI12J4zPvO3lJulMFx8BAXStKiUox7PMYn2vrVZA90eG63hgjEJalJUjCq13P1JJ81tRyyyOR1NJiRfsKeZwHAFQDZ7m0uMjAEGVBG7JQFEd8eaQUd3yYUCaqLFQDnlD5BKiLd7muleTq9KnyjvwZfTPSWF8TC+ey4aOxcmxRrFcUohRYBlQxdAvpIUhqRFIxonIclfITykhRRACB3Qh7YMrRO0aJ2g5U0TQtypFoAiVQ+gGCE3yEnZMoMj5He4e6m4giF+h2eTdlS5ZommNcFCUM03sU9CJlJgKjGTZIQSGApKSG0KZcYCiTKPUYVY5RJWdks1msRYhgpJ2IYKKLAMUEWIYy1QA9ligLLDMO8EmrDdQ0WBGoXn6nRRmrXZ1YtTXDNinbllIPMzEr5TLCSybWuOjvjNSdIOjXBWMoUOiwHLNoVAvbxTTGmQ0Sn0N8DHaKSVyViZK06NapBBqVishwTQWBlTsbZxanYrAyp2IpYlgjKo21X6LR4EZ0eHxrsy9klokIOiORM8nc2ZadQQmWyvkKCWwu5QQ2C5oCBEMZmKljs3sMtgIJWTFZvUHKGxmra2NRwkNMczos3linTfJWxtXRrWmBkiXuy+ACjJqIQVtlRxSl0i63CqYEAAuPFxXN9/GT2xaT/JutNXMuf4GU8PynXu2+O6flku5pDccdcRYL7gOcWhoIbpna2AVw5vqeSPVNGsNHBq3wGYGhBB9Fg/q2VdxKWih6ZxumDcI/5TO1wkWvp6ZBvWxoAueWt1Mne6jSOhivQxlfM0jccl57TUrKljUWVWUoOkhaOV9l7VXBapvIWTSJcR4eocGjOgmvCloTRD3SmkCVC8iqyrGBSSQUAAVSAEuVPkKF5gnQ6LwX6MfOCLimHCCJQNM87inZ1j5MBItTZ5e+7LEfCgreYlxglYbNRYbir7BrH5Sk2G4u2uA1B8pUNgmeiwfszVqkwMrWCXvOzR+p8Fhknti5P0a447mkvZ6+wwKlSboC46e+8Any5Lzp6vi+jtWmSdWW3vczVpA4DovCm5xyb75O+EIyW2ipUunc/orwN29z/s28cV6FC6HOTyGq38OJcyE02NFadzHhCwyZIrjGuAUGQbkNOhEdN1GSTyKqpFLFa5CuMVzhod8uxjWOU8US3yiovmv7Fj02xtr2Vi8OOp0+6SVdm1bVwNpsHFkjhBjoptJ8kOT9M5geNhHjOil7WN7H2wyXbkjySqNE1HoIVSOKlxFtT9F23uREOEggQ7l4QuzBlxRjsnycuTDJu4nOe0/DI67FTlx6af/be1/kmKyR/dyBnK4njadGtI7vlOwNqO75GwNpDrgJqAtgl1yFSxhtFZnu2BXVi0k59IUpRj2wvwtXkur/jshn54Gg5xX2B88AHFAHEJAQLcHggCfZ7TwCAsIYYzkEqCyRhrOQSodiqrspLAMoGkDSY4lfGa7UZJ5pK6SdUfRYMUYwVGfXqHmVzRVndCKM24xOoHBopuf4gtAA8114tNGavdRGSSg+i8Krjq5wE6xpP0VuDTuUhWq/ShgqMGxbPot4vH7M2p/BWrYhTzil3lPvDrlcQIbzSnjbW6NV/H/sje069l+lQYRqAehXkSnJPs2cpL2RVsAG94AMubLrJgwujHOahvq1dCjl3S2t8lcPjguhahNcx/oqUX8kMrmYI024DXqtcuDC8SmmYwlNyaLdSsBT3cHFwLQC0sIEgkjcH91xxjHxtO7b4+P8/k1jBvJ+K/yUjd81HjOjxgOu2EwXfRV45JdC2P0WRUECD67Qs3H+yNrsbTrDmFm4MmUGPpPEha4JbcibMZx/Sy82iCJX0ePDjyRUqPKnknCVEOtQh6HG/QlqZCzZBStBi+B/dSDZYtXRHSY16M3qZMt0KIHBdMMcV0YyyNjp8AtKI3FZ1FbGIl1JKwAyIsYbGoEWGBADAgCcqAM6pT0cIJ3K+T1GBK3XfJ9DCXXJRqWzTHDnuVwbo0vR1xyyRD6LQBAB030ClRnJgpNvkpVCAdCz1C6Fhb7f8As1v8Mo3JE+PhsrUXHgqPRUfatLs4b7+xdGpWiySS2t8C282blncgN14cSuHJjbfBM4Wyx+PY0NLiKrHSe7aSIeJADv4XRhhsrdyu6v31yZvDKTdfpa9/j8GZSa1xkyBynSUnKjoknXA/8KODiPOVn5H7JUmhb6Z5j1hNSXwaKa+CmXbrajRsmlT1BgAfmOqf+TOUq6LhotO7ndY0U/oT4f8AozWSS9EsDW8S7/yk1Fjc5NFynUbEtJ/ZRlxUrRg5O6Z6C2pw1p4kSRyK+m0OPbhV+zwdVO8gw012bTlsju0bR2GGIoVhhiqhWRCKFZGRaEguppACaKAO7tABBiAGNtyVSixbhzbWNyq2E7jKqP8A4K+S1+VRj+fR7+OJVqa6bHnpqvGUnJ37OiPHJSqW2upH1lbROmOT4KVe3p7yZ8iuqqj7NVKT4OYxs/COpCjHNLiQpJ/IytqMoAHPRVPIv2x6IjHm2VqluRxHkVG7k1UiKNqJ1lVKTXaBytcF0hjRoP3WDlKT4MufZ5/E8ZFN8d3Uc38zS2OhAXoYdK8q4av4oxy6iWHuPHyHa4k2uPczHSSDB+yWTSyxNJl4NVHIE6qG7yo2M6tyY1l5ES0gGPeIIH2UywOiW0/ZYZdAk6THI6dRzWTx0TTLDKGc+7IOpa2C49NE4cypKzObaXLG2lsacd47NBOkAnN4n9F3RgnJcc/BwOTpuz1tlSzMafDjufFfQ6eD2I8fPL9bHdwVtsZluRHdpUFnZUUBOVAA5UwCDVRJBYkBGRFAMZQ5q1ElyGtYAqSSJsmUwBedD0KmXTKgrkjEq04AlfD/AFSLjsj8H0EJW3RWOxHPTaV5sMjjdezddgsYY/fWVbzdL+xtqxdWkwjVms8Nlqpwri0y4ylfDK5pcGkA8iArhXto13P2JYxw1IDh4f54hU0kU2n1wdQEn3xrw0yiPJTKTTtIJ9fpLLxG0D/OazeWUv3GcSpWd4nyKqFp2jZRMLEMFZV3zu9BHnuvSw6pY1+SMmLeqklRmYf2abQqCrTNQOh4c0H4mkfMQNR4Lqn9Qnlg4nLj0OPHNT+D0Btaj2hpAaI4tiRz/wBLklknH0dKeNO7H2+Cg/MJAkNnXopW+fTSfx7JlnUfTLlOwpsGuro0EjL5ET90f9JQ5dy+PX9qzJ5skpccR/3/ALGfiC0ECWzoQPdnrC5PLkVxTr+OCtifL5MbHbx2RjGAue97QAOuy9f6XjSe6Rxa69tI+hWFT/rbwhrG+YaAfqvoMEt0bPHzR2yocai1syojvkBRHepDJFQIoLI7wJUFktKADa2U0rE2MGitKiWyJTEckByBnIAz8WpwRyIXx/19VkivR7GilceTKOkdV4KPQXIydFPsn2V6jlqkaxRVyZvXdbWor8m17Qu7EcVKk7sW5hUqgB1GY6AGYhaKT79kyi2uOCTWaDIbpERJgnmmp369f/MNkmuwHXQPyt9FLTKWJr2B348PQJ3Pqx+MCvWzDgIMg7R4dF0Y8+T9tk+JLmhLapktOseMjqOaWVyb5dlqEatIB93HPlppvupxwY5RVC6l0YkLohGp0RtCpVSehifH+F2vHH4OeToOyw5znhxMAGZ3KvFik38GOXURUa7PW0fdaAva062wo8bK90rJNRbWZ0CaiLCiO8RYUd3idhQPeJ2KjQt2TqdvuqSJbHkqiAZQM5ICUDGU6ZKAHihG6Bi6tIO0IkLjz4MeZbZqzSE5QfBQrYZBJbyOh5rwsn0jxyc8T9Ph/J3w1VqpGRWpFuhBBXzs8c8cqmqZ3wkpcorOZz/2tMStmyfwVnOjhA+yuS/UzZKxRqI2l7Ti7iigorurtOgcD0IWvjlHtFpCXvKpItMU6srUBgVK8iFUIcohixXP0CqUORIRUrGVaigDYSUunaIlVG3aWU6nT7r1Y493Z5WTOlwjYt6caBdCSSpHDKVuyzVdEdF143wYy7FGorsVEZ0WFHZ07FR2dFhQOdOwo9BPoug5wSUgIlKxkgpWMdQZKYGixoAVABUqN6lJugEBc7ZZKhjQupSB3APULKeKE1UlZcZtdCH2bOQ9Fn9piqlGjRZ5r2Z97hLXbe6foVwar6ZGfMHTOrDrXH93Ji1sKqA7T0XlT0OeLqrPShrcbXZWusJqO0Og5c1rj0eWLuhrWY0VX4G4ajQhdMsc9vI1rItg17ct33XnSjsdM2x5VIz6rCrizXcKbSM7E9FrGXPBEpqix7PfuBK6p4XJWkc33UVwQzC6hOoA6qY6ebFLWQXRpWmFAQXHN4bBbQ0iTuXJyZNY5cR4Nam1diOFssM3WiIJud/ILoh0QyuVQESgCMyAJDkxESmB6EldJzgypbGkTKmyqJBRYUOp1YTTES6sTxTsAZQItN2CxZaJUsYJUgCUDFuUsaEPCzaKTEvCkqxFQKGUmVatMHgspQT7RpGbXRVfbt5D0U+KHwX5ZfIHdDkmopEubZGVUTZ0J0AYCokY0KqEOYFSRJNffyC6IdEsSQrEAQkABQMGUgIlAHpCF1M5wVDKR0rNsqjg5Kx0ECqTFRIVWTRMp2FFi3qyOhhZXbZTVDpSAgpAAVIxbkmMS9QxoS9SyhD1LGV3qGUJclQxbkUMGEgOhUhBBMQTVQiXPiFXQJWMYJEnmfRbQ6Jl2cWK7JALEWAtzErADIlYwcqLCj0ZXYc4slZSLQJKyZaIlTYyQ5UmILOmIg1U7FQoVy0yOeo5rkyZHjlaOiMFKNMezExmDSCJ0nhKFq47lFqrE9O6tF7MukwBJUsYslSMU9SxiailoaEPUDEPSoqxJRQC3JUOwSlQHSmATHKoiYutWyx4noiT2jjHcSx2ZzOUgdZRdtDXCZo1KeUkciulKuDLsBMQJCQwSEgFvamAvKnQHoCF1nMKepkikxLnrGSNExLq8LJloht0p3MdBZpTUmIkBWmSyCFy50b42KcJnwXFNWjeLog4i5gLQJ2AngqhqpQjtB4IzdjW37xuAfoYWkdTkXElZEsMH0G3GKTtA4zvGV2nnC3WqxNcMyenyLtDGXbXbHy4q45Iz6ZEsco9kVHqmiRD6iVDK9WsBqSAPHRSUhYqA7GfHglQAVrltMF7jAA34ItR5Y1FydIzPaxeMwGUTpzPisJZGzp8MY8HC8I8eXVCk0hOCYdK9PETppCqM/kmWNege9Ljry9FLlbHVLg0bDQtMSQdFrj7MZGtdiXHhxXa0ZJ8CISA4hIASEUMhtOUxE9ygLNVxXWcxXqBJodld7VDiUpFc7wsnEtMk0gVm0XZADh4pUFjmVJVxVCYYU5IblQ4ypi6phebmVcHXj5FZRM8VjGrLbdE1x6q5MmJQt6Qa6YJzbHgI4FZwjt/yaTla/gRiNBzoLSBBmdQR0KTi7tFQmkqYhtuZk1HPbEe84mDzWrbrsm16Qq5qZZykgxA1grODd2V32UqjidXEvM6gkwP3W5N10MpvI1pw2OX3hO+bRL/ACc24cSc75HAbAKm2xUl0hsBZdFWQdFaYENqToi7Bqh7H6yknyS0bGFvIe0gCQQTIkctV14IvdZzZGqNu+Z8Lt5kE7ayu2aMIsqwsyiMqKANlBUkJseyirUCHInugq2oVl6rb8lvRlZUfThTQ7FOYlQWJqUQUnGykxJYR4j6rOWMtSOBWTi0XaBcVDZSRIcjcFHPAKjLijkVMqGRw6ANF0yDI/KRosfs66Zp577QmrViJBmVwZrg6Z041uVoIO0nhumrrgl1fJWqgz/SQnVdj/gqUmEAyZE6ROglOK45CTt8FOu4T+pUpqyuTPNwTGkTIGmhHMroSJYD71zfdAknbT4lW0RdfTD2iW6xMazPFZN06BA22aNYHISJjgkrY20Kuakb+iRcRNK6zHTU+CqKbfASpLk2cOsHuMnQadV1YtM7uRyZM6qkektrYNGg/ld6jXRyNl0gkRw/VU1YJkNt+alQHuGNpAKlBEuQYYqoQQamIGEAPp3BG+qSnQOI3M13+fotE0yGqEvtJ216J0BXfQKVBYp1JKhi3UAk0OwTbSspYy4zFPtyFi8bNVNCiwhZ1JFcMgVeYIWiZLQb3DbdKSjLhjVroS63bpwjkYHos3psb9UV5pgV7aRAIHkssmj3dMuGortFCrY1IgZT5x+iyeiyVSaNVqYXyihWw6ueA/8AoKVo8vtIr7nEUnYBXdxDeh16LshppLsxlqY+htPs1U0l0wZExotPt2Z/co0aeB1dPeaIj/Sy+yd3ZT1SroWeztcmMzAydYJkjlsktFK++B/dxrrktN7KtJl7i7zW60kPZk9VP0atlgdNnwtA8lvHFGPSMZZJS7Zp07do2CukTYwAIAfTAifJACygDgEASgDkxAQigOasyiHBIYJrOHFPe0LamS2/PET9VSzL2J4yfxbDvorU0yXFkhzTxCq0InIEqCzsiW0dgmkOSlwHuFutwpeMpTYt9op8SH5GKNml4x7xb7ZyWxj3oWaDk9rFaBLHck1YnRGvJUiWG1x5KhDmk8krHQxodyTFQwMKBjA0oAIMKKCwwxOhWGEBZCQzk6FZBcE6EKq3LRu4BFgVfaDOf0S3IdHlcC/5Ft6sMrg2tTQSTmok/wB27f8A0I8VLiOz2La4IDgQ4ESHNIIIPEHipGA+qOJCllISaoUDAqFJjRWc08JHmp5XRXBAuKjfmnqE1kmvYnCLGMxZ43aD5wqWol7QvEhrcdb8zXD0KtamPsnwv0OZjFI/NHXRWs8H7JeKS9Fqncsds4HoQVamn7IcWgswVcCOlLgZCKQEGEUFkQEUBIARQBAhFATISoCcwQB2cJgR3o5hAEfiGjigAat8zggZWqYm0JbkFFWpih4BS5j2lardvO5gKHMpQKrqo4nMspZkaLEwO9HL6qPL+C/GfGLqmWuykL0Gjjix+E9p7i0P/VVc1syaLwXUnHxbw6iCs3GzSz6H2X7c0Lshj/8AornTu3uljz/Q/j0MHqspY2ilKz1jaqgoa2ogBzWgooLBqU0mgsq1WKGikym+kSoaLTF/hSVO0e4dTsgOGqpRE5Dw1w2c4dCVStE8Bd/UHzHzgqt817Ftj8Ei9qeB8k/NMXjiScReOAPqjzyDxI72qfy/VP7l/AvD+SBi4/Kfon9yvgPAwxizeTh5J/cxF4WF7TZzPoU/uIi8MiPaDef3T88fkPDIA3w/N90vPH5H4ZAOuxz+6XniHhYp1yOZ9FLzopYWLNwORKl50V4RZufAfdQ87KWJAOuHc46KHkky1jihZJ4qeyjgU0iWyZ/yU6FZ82x/4j1P3XrSPPgeVv1KLYWH/Ceo+6GCPu9l8Lf7G/ZchsXm8Ov6oAt0uPmmJBv38kAVK+/qoZaB/lIA6aEA4JiBcgYtykBbkhiXKWUIepGJcpKI4pDJQBIQBwQMJAHOQAKBguQIEpgQ/wDRAggrRLDTEf/Z"
const val image3 =
    "data:image/jpeg;base64,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"


// ТЗ для ДЗ

// 1. Добавить в проект Navigation component
// 2. Переделать все навигауии на Navigation component с анимацией
// 3. Переделать все передача данных через SafeArgs
