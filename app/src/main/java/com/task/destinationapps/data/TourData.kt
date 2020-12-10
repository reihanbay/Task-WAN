package com.task.destinationapps.data

import com.task.destinationapps.R
import com.task.destinationapps.model.TourModel

class TourData {
    object Destination {
        val name = arrayOf(
            "Candi Prambanan",
            "Pura Urun Dalu",
            "Candi Borobudur",
            "Raja Ampat",
            "Hotel Aston Imperium"
        )

        val picture= arrayOf(
            "https://images.unsplash.com/photo-1566559631170-a462eb20c432?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=889&q=80",
            "https://images.unsplash.com/photo-1586168078017-03cbb0884291?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1402&q=80",
            "https://cdn.pixabay.com/photo/2013/10/20/21/21/budha-198577_960_720.jpg",
            "https://cdn.pixabay.com/photo/2017/08/09/12/05/piaynemo-2614341_960_720.jpg",
            "https://ak-d.tripcdn.com/images/220s0g000000826gf7CE7_R_550_412_R5_Q70_D.jpg"
        )
        val range = arrayOf(
            5.0,4.5,6.0,4.0,4.0
        )
        val price = arrayOf(
            120000,
            200000,
            100000,
            500000,
            450000
        )
        val durasi = arrayOf(
            "5 Hari 5 Malam",
            "7 Hari 6 Malam",
            "3 Hari 2 Malam",
            "5 Hari 5 Malam",
            "2 Hari 1 Malam",
        )
        val place = arrayOf(
            "Yogyakarta, Indonesia",
            "Bali, Indonesia",
            "Magelang, Indonesia",
            "Raja Ampat, Indonesia",
            "Banyumas, Indonesia"
        )
        val detail = arrayOf(
            "Candi Prambanan atau Candi Roro Jonggrang adalah kompleks candi Hindu terbesar di Indonesia yang dibangun pada abad ke-9 masehi. Candi ini dipersembahkan untuk Trimurti, tiga dewa utama Hindu yaitu Brahma sebagai dewa pencipta, Wisnu sebagai dewa pemelihara, dan Siwa sebagai dewa pemusnah",
            "Di Bali , pura Hindu dikenal sebagai \" pura \", yang dirancang sebagai tempat peribadahan terbuka di kompleks bertembok. Dinding kompleks memiliki serangkaian gerbang yang dihias dengan rumit tanpa pintu untuk dimasuki pemuja. Desain dan denah pura suci mengikuti tata letak bujur sangkar. [2] [3] Kuil yang khas ditata menurut teks Lontar kuno dengan tiga halaman dipisahkan oleh dinding rendah yang ditembus oleh pintu gerbang berornamen. Halaman luar adalah untuk pengejaran duniawi, dengan paviliun yang digunakan untuk pertemuan, artis yang sedang beristirahat, dan musisi di festival. Kios makanan didirikan di sini selama festival.",
            "Borobudur adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta.",
            "Kepulauan Raja Ampat merupakan rangkaian empat gugusan pulau yang berdekatan dan berlokasi di barat bagian Kepala Burung Pulau Papua. Secara administrasi, gugusan ini berada di bawah Kabupaten Raja Ampat, Provinsi Papua Barat",
            "Hotel yang cocok untuk wisatawan bisnis maupun rekreasi. Dengan 146 kamar yang luas, 4 ruang pertemuan dan 1 Ballroom seluas 1024 m2 dengan kapasitas hingga 1200 orang, Paseban Lobby Lounge, The A Bar Pub and Bistro, Raga Gym, Spa & Reflexology, kolam renang outdoor dengan kolam renang anak-anak, akses internet WiFi gratis, butik, dan Business Center untuk memenuhi kebutuhan bisnis Anda."
        )
        val category = arrayOf('B','B','B','C','D',)

        val listData : ArrayList<TourModel>
            get() {
                val list = arrayListOf<TourModel>()
                for (position in name.indices){
                    val tour = TourModel()
                    tour.name = name[position]
                    tour.pict = picture[position]
                    tour.range = range[position]
                    tour.category = category[position]
                    tour.price = price[position]
                    tour.durasi = durasi[position]
                    tour.place = place[position]
                    tour.detail = detail[position]
                    list.add(tour)
                }
                return list
            }
    }
}